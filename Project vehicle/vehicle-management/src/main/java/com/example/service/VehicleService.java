package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Vehicle;
import com.example.repository.VehicleRepository;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    // Constructor injection
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    // Save vehicle (POST)
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    // Get all vehicles (GET)
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // Update vehicle (PUT)
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        Vehicle existingVehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));

        existingVehicle.setVehicleNumber(vehicle.getVehicleNumber());
        existingVehicle.setOwnerName(vehicle.getOwnerName());

        return vehicleRepository.save(existingVehicle);
    }

    // Delete vehicle (DELETE)
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}

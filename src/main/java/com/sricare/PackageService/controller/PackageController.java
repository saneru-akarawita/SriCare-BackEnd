package com.sricare.PackageService.controller;


import com.sricare.PackageService.dto.PackageDTO;
import com.sricare.PackageService.model.PackageType;
import com.sricare.PackageService.model.SriPackage;
import com.sricare.PackageService.service.PackageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/package")
public class PackageController {
    private final PackageService packageService;
    @PostMapping("/add")
    public void addPackage(@RequestBody PackageDTO packageDTO){
        packageService.AddPackage(packageDTO);
    }

    @GetMapping("/all")
    public List<SriPackage> getAllPackages(){
        return packageService.getAllPackages();
    }

    @GetMapping("/all/{type}")
    public List<SriPackage> getAllPackagesByType(@PathVariable("type")
            PackageType packageType){
        return packageService.getAllPackagesByType(packageType);
    }
    @GetMapping("/{id}")
    public SriPackage getPackageById(@PathVariable("id") Long id){
        return packageService.getPackageById(id);
    }
}

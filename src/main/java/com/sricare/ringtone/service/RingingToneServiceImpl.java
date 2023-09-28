package com.sricare.ringtone.service;

import com.sricare.ringtone.dto.RingingToneRequestDTO;
import com.sricare.ringtone.model.RingingTone;
import com.sricare.ringtone.repository.RingingToneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RingingToneServiceImpl implements RingingToneService{
    private final RingingToneRepository ringingToneRepository;
    @Override
    public void saveRingingTone(RingingToneRequestDTO ringingToneRequestDTO) {
        RingingTone ringingTone=RingingTone.builder()
                .name(ringingToneRequestDTO.getName())
                .build();
        ringingToneRepository.save(ringingTone);
    }

    @Override
    public RingingTone getRingingToneById(Long id) {
        return ringingToneRepository.getReferenceById(id);
    }

    @Override
    public List<RingingTone> getAllRingingTone() {
        return ringingToneRepository.findAll();
    }
}

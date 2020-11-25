package com.utng.giti.SpringApi.controller;

import com.utng.giti.SpringApi.model.Medicamento;
import com.utng.giti.SpringApi.model.Message;
import com.utng.giti.SpringApi.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/recordatorios")
public class MedicamentoController {

    @Autowired
    private MedicamentoService service;

    @PostMapping("/addMedicamento")
    public Message addMedicamento(@RequestParam("nombreMedicamenteo") String nombreMedicamenteo,
                                  @RequestParam("pacienteId") int pacienteId,
                                  @RequestParam("tipoMedic") String tipoMedic,
                              @RequestParam("file") MultipartFile file) throws IOException {
        Message resp = service.addMedicamento(nombreMedicamenteo,pacienteId,tipoMedic, file);
        return resp;
    }

    @GetMapping("/getMedicamentos")
    public List<Medicamento> getMedicamentos(@Param("pacienteId") int pacienteId){
        System.out.println(pacienteId);
        return service.getMedicamentos( pacienteId);
    }

    @PutMapping("/updateMedicamentos")
    public Message updateMedicamentos(@RequestParam("nombre") String nombre,
                                      @RequestParam("medicamentoId") int medicamentoId,
                                      @RequestParam("pacienteId") int pacienteId,
                                      @RequestParam("tipoMedic") String tipoMedic,
                                      @RequestParam("file") MultipartFile file)throws IOException {
        Message resp = service.updateMedicamentos(file , nombre, tipoMedic, medicamentoId, pacienteId);
        return resp;

    }

    @DeleteMapping("/deleteMedicamento/{medicamentoId}")
    public Message deleteMedicamento(@PathVariable int medicamentoId){

        System.out.println("medicamentoId" + medicamentoId);

        Message resp = service.deleteMedicamento(medicamentoId);
        return resp;

    }

}

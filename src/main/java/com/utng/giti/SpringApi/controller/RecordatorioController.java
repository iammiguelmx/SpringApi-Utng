package com.utng.giti.SpringApi.controller;

import com.utng.giti.SpringApi.model.Message;
import com.utng.giti.SpringApi.model.Recordatorio;
import com.utng.giti.SpringApi.service.RecordatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("/recordatorios")
public class RecordatorioController {

    @Autowired
    private RecordatorioService service;

    @PostMapping("/addRecordatorios")
    public Message addRecordatorios(@RequestBody Recordatorio r) throws IOException {
        Message resp = service.addRecordatorios(r);
        return resp;
    }

    @GetMapping("/getRecordatorios/{medicamentoId}")
    public Optional<Recordatorio> getRecordatorios(@PathVariable int medicamentoId){

        return service.getRecordatorios(medicamentoId);

    }

    @PutMapping("/updateRecordatorios")
    public Message updateRecordatorios(@RequestBody Recordatorio r) throws IOException {
        Message resp = service.updateRecordatorios(r);
        return resp;

    }

    @DeleteMapping("/deleteRecordatorio/{recordatorioId}")
    public Message deleteRecordatorio(@PathVariable int recordatorioId){

        System.out.println("recordatorioId" + recordatorioId);
        Message resp = service.deleteRecordatorio(recordatorioId);
        return resp;

    }
}

package com.tecsup.HospitalMdb.citas.controller;

import com.tecsup.HospitalMdb.citas.models.Cita;
import com.tecsup.HospitalMdb.citas.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    public List<Cita> listarTodos() {
        return citaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Cita buscarPorId(@PathVariable String id) {
        return citaService.buscarPorId(id);
    }

    @PostMapping
    public Cita guardar(@RequestBody Cita cita) {
        return citaService.guardar(cita);
    }

    @PutMapping("/{id}")
    public Cita actualizar(@PathVariable String id, @RequestBody Cita cita) {
        cita.setId(id);
        return citaService.guardar(cita);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        citaService.eliminar(id);
    }

    @GetMapping("/paciente/{idPaciente}")
    public List<Cita> buscarPorIdPaciente(@PathVariable String idPaciente) {
        return citaService.buscarPorIdPaciente(idPaciente);
    }

    @GetMapping("/medico/{idMedico}")
    public List<Cita> buscarPorIdMedico(@PathVariable String idMedico) {
        return citaService.buscarPorIdMedico(idMedico);
    }

    @GetMapping("/estado/{estado}")
    public List<Cita> buscarPorEstado(@PathVariable String estado) {
        return citaService.buscarPorEstado(estado);
    }

    @GetMapping("/fecha/{fecha}")
    public List<Cita> buscarPorFecha(@PathVariable String fecha) {
        return citaService.buscarPorFecha(LocalDate.parse(fecha));
    }
}
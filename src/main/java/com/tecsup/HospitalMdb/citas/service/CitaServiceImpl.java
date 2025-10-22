package com.tecsup.HospitalMdb.citas.service;

import com.tecsup.HospitalMdb.citas.dao.CitaDAO;
import com.tecsup.HospitalMdb.citas.models.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDAO citaDAO;

    @Override
    public List<Cita> listarTodos() {
        return citaDAO.findAll();
    }

    @Override
    public Cita buscarPorId(String id) {
        return citaDAO.findById(id).orElse(null);
    }

    @Override
    public Cita guardar(Cita cita) {
        return citaDAO.save(cita);
    }

    @Override
    public void eliminar(String id) {
        citaDAO.deleteById(id);
    }

    @Override
    public List<Cita> buscarPorIdPaciente(String idPaciente) {
        return citaDAO.findByIdPaciente(idPaciente);
    }

    @Override
    public List<Cita> buscarPorIdMedico(String idMedico) {
        return citaDAO.findByIdMedico(idMedico);
    }

    @Override
    public List<Cita> buscarPorEstado(String estado) {
        return citaDAO.findByEstado(estado);
    }

    @Override
    public List<Cita> buscarPorFecha(LocalDate fecha) {
        return citaDAO.findByFecha(fecha);
    }
}
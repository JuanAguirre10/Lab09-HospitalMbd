package com.tecsup.HospitalMdb.consultas.service;

import com.tecsup.HospitalMdb.consultas.dao.ConsultaDAO;
import com.tecsup.HospitalMdb.consultas.models.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaServiceImpl implements ConsultaService {

    @Autowired
    private ConsultaDAO consultaDAO;

    @Override
    public List<Consulta> listarTodos() {
        return consultaDAO.findAll();
    }

    @Override
    public Consulta buscarPorId(String id) {
        return consultaDAO.findById(id).orElse(null);
    }

    @Override
    public Consulta guardar(Consulta consulta) {
        return consultaDAO.save(consulta);
    }

    @Override
    public void eliminar(String id) {
        consultaDAO.deleteById(id);
    }

    @Override
    public List<Consulta> buscarPorIdPaciente(String idPaciente) {
        return consultaDAO.findByIdPaciente(idPaciente);
    }

    @Override
    public List<Consulta> buscarPorIdMedico(String idMedico) {
        return consultaDAO.findByIdMedico(idMedico);
    }

    @Override
    public Consulta buscarPorIdCita(String idCita) {
        return consultaDAO.findByIdCita(idCita);
    }
}
package com.itmo.mpa.service.mapping

import com.itmo.mpa.dto.request.PatientRequest
import com.itmo.mpa.dto.response.PatientResponse
import com.itmo.mpa.model.Patient

fun PatientRequest.toModel() = Patient(name!!, age!!, status!!.toModel())

fun Patient.toDto() = PatientResponse(id!!, name, age, status.toDto())
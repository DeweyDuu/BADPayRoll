# Payroll System – Bad Code Experiment

## Overview
This project is a simple Java payroll system. The purpose of this assignment was to intentionally break good coding practices in order to observe the consequences and understand why clean code principles are important.

The system models different types of employees and calculates their pay.

---

## Project Structure

### Package: `payrollContents`
- `E` – Base employee class  
- `c` – Contractor  
- `he` – Hourly employee (with overtime)  
- `se` – Salaried employee  

### Package: `payrollSystem`
- `P` – Payroll system manager class  

---

## Functionality

### `E` (Base Class)
- Stores:
  - `n` → name  
  - `pr` → pay rate  
  - `hr` → hours worked  
- `pe()` calculates pay as:
  
  pay = pay rate × hours

### `c` (Contractor)
- Extends `E`
- Uses the base pay calculation

### `he` (Hourly Employee)
- Extends `E`
- Overrides `pe()`
- Pays 1.5× rate for hours over 40

### `se` (Salaried Employee)
- Extends `E`
- Overrides `pe()`
- Always pays for 40 hours regardless of hours set

### `P` (Payroll System)
- Stores employees in an `ArrayList`
- `addEmployee(E em)` adds employees
- `PPE()` returns an array of calculated pay values

---

## Intentional Rule Violations

This code intentionally ignores best practices:

- Non-descriptive class names (`E`, `c`, `he`, `se`, `P`)
- Poor variable names (`n`, `pr`, `hr`, `el`)
- Minimal commenting
- No validation for invalid input (e.g., negative hours)
- Inconsistent naming conventions
- Weak overall design

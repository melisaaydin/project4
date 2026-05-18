package com.example.project4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "    <meta charset='UTF-8'>" +
                "    <title>Medical & Hospital Management System</title>" +
                "    <style>" +
                "        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f6f8fa; color: #24292e; margin: 0; padding: 20px; }" +
                "        .container { max-width: 1200px; margin: 0 auto; }" +
                "        h1 { color: #0052cc; border-bottom: 2px solid #e1e4e8; padding-bottom: 10px; margin-bottom: 20px; }" +
                "        h2 { color: #006644; margin-top: 30px; }" +
                "        .badge { background-color: #0052cc; color: white; padding: 4px 8px; border-radius: 4px; font-size: 12px; font-weight: bold; vertical-align: middle; margin-left: 10px; }" +
                "        .status-panel { background-color: #ffffff; border: 1px solid #e1e4e8; border-radius: 6px; padding: 15px; margin-bottom: 20px; display: flex; gap: 20px; box-shadow: 0 1px 3px rgba(0,0,0,0.05); }" +
                "        .status-item { flex: 1; text-align: center; border-right: 1px solid #e1e4e8; }" +
                "        .status-item:last-child { border-right: none; }" +
                "        .status-item span { display: block; font-size: 24px; font-weight: bold; color: #0052cc; margin-top: 5px; }" +
                "        table { width: 100%; border-collapse: collapse; margin-top: 10px; background-color: #ffffff; border: 1px solid #e1e4e8; border-radius: 6px; overflow: hidden; box-shadow: 0 1px 3px rgba(0,0,0,0.05); }" +
                "        th, td { padding: 12px; text-align: left; border-bottom: 1px solid #e1e4e8; }" +
                "        th { background-color: #f1f3f5; color: #495057; font-weight: 600; }" +
                "        tr:hover { background-color: #f8f9fa; }" +
                "        .footer { text-align: center; margin-top: 50px; font-size: 12px; color: #6a737d; border-top: 1px solid #e1e4e8; padding-top: 20px; }" +
                "    </style>" +
                "</head>" +
                "<body>" +
                "    <div class='container'>" +
                "        <h1>Hospital Intelligence & Medical Controller.. </h1>" +
                "        " +
                "        " +
                "        <div class='status-panel'>" +
                "            <div class='status-item'>Active Staff<span>14</span></div>" +
                "            <div class='status-item'>Medical Departments<span>4</span></div>" +
                "            " +
                "            " +
                "        </div>" +
                "        " +
                "        " +
                "        <h2>Medical Departments</h2>" +
                "        <table>" +
                "            <tr><th>Dept No</th><th>Department Name</th><th>Clinic Location</th></tr>" +
                "            <tr><td>10</td><td>CARDIOLOGY (Accounting)</td><td>A-Block, 4th Floor (NEW YORK)</td></tr>" +
                "            <tr><td>20</td><td>NEUROLOGY RESEARCH (Research)</td><td>B-Block, 2nd Floor (DALLAS)</td></tr>" +
                "            <tr><td>30</td><td>EMERGENCY & TRIAGE (Sales)</td><td>Ground Floor (CHICAGO)</td></tr>" +
                "            <tr><td>40</td><td>SURGICAL OPERATIONS (Operations)</td><td>C-Block, 5th Floor (BOSTON)</td></tr>" +
                "        </table>" +
                "        " +
                "        " +
                "        <h2>Medical & Laboratory Staff Members</h2>" +
                "        <table>" +
                "            <tr><th>Staff ID</th><th>Name</th><th>Role / Job Title</th><th>Hire Date</th><th>Salary / Funding</th><th>Dept No</th></tr>" +
                "            <tr><td>7839</td><td>DR. KING</td><td>CHIEF OF MEDICINE (President)</td><td>1981-11-17</td><td>$5,000</td><td>10</td></tr>" +
                "            <tr><td>7566</td><td>DR. JONES</td><td>CLINICAL MANAGER (Manager)</td><td>1981-04-02</td><td>$2,975</td><td>20</td></tr>" +
                "            <tr><td>7788</td><td>DR. SCOTT</td><td>MEDICAL ANALYST (Analyst)</td><td>1982-12-09</td><td>$3,000</td><td>20</td></tr>" +
                "            <tr><td>7902</td><td>DR. FORD</td><td>BIOMEDICAL ANALYST (Analyst)</td><td>1981-12-03</td><td>$3,000</td><td>20</td></tr>" +
                "            <tr><td>7698</td><td>DR. BLAKE</td><td>RESEARCH LEADER (Manager)</td><td>1981-05-01</td><td>$2,850</td><td>30</td></tr>" +
                "            <tr><td>7782</td><td>DR. CLARK</td><td>OPERATIONS MANAGER (Manager)</td><td>1981-06-09</td><td>$2,450</td><td>10</td></tr>" +
                "            <tr><td>7499</td><td>ALLEN</td><td>RESIDENT PHYSICIAN (Salesman)</td><td>1981-02-20</td><td>$1,600</td><td>30</td></tr>" +
                "            <tr><td>7521</td><td>WARD</td><td>RESIDENT PHYSICIAN (Salesman)</td><td>1981-02-22</td><td>$1,250</td><td>30</td></tr>" +
                "            <tr><td>7654</td><td>MARTIN</td><td>LAB TECHNICIAN (Salesman)</td><td>1981-09-28</td><td>$1,250</td><td>30</td></tr>" +
                "            <tr><td>7844</td><td>TURNER</td><td>LAB TECHNICIAN (Salesman)</td><td>1981-09-08</td><td>$1,500</td><td>30</td></tr>" +
                "            <tr><td>7369</td><td>SMITH</td><td>CLINICAL CLERK (Clerk)</td><td>1980-12-17</td><td>$800</td><td>20</td></tr>" +
                "            <tr><td>7876</td><td>ADAMS</td><td>CLINICAL CLERK (Clerk)</td><td>1983-01-12</td><td>$1,100</td><td>20</td></tr>" +
                "            <tr><td>7900</td><td>JAMES</td><td>MEDICAL SECRETARY (Clerk)</td><td>1981-12-03</td><td>$950</td><td>30</td></tr>" +
                "            <tr><td>7934</td><td>MILLER</td><td>MEDICAL SECRETARY (Clerk)</td><td>1982-01-23</td><td>$1,300</td><td>10</td></tr>" +
                "        </table>" +
                "        " +
                "        <div class='footer'>" +
                "            <p>SWE304 DevOps Project 4 — Medical Application Cluster Deployment Successful.</p>" +
                "        </div>" +
                "    </div>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
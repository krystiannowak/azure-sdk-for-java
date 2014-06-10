/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler.models;

import java.util.ArrayList;

/**
* Recurrence schedule for the job.
*/
public class JobRecurrenceSchedule {
    private ArrayList<JobScheduleDay> days;
    
    /**
    * Optional. Days of the week that the job should execute on.
    * @return The Days value.
    */
    public ArrayList<JobScheduleDay> getDays() {
        return this.days;
    }
    
    /**
    * Optional. Days of the week that the job should execute on.
    * @param daysValue The Days value.
    */
    public void setDays(final ArrayList<JobScheduleDay> daysValue) {
        this.days = daysValue;
    }
    
    private ArrayList<Integer> hours;
    
    /**
    * Optional. Hours of the day that the job should execute at.
    * @return The Hours value.
    */
    public ArrayList<Integer> getHours() {
        return this.hours;
    }
    
    /**
    * Optional. Hours of the day that the job should execute at.
    * @param hoursValue The Hours value.
    */
    public void setHours(final ArrayList<Integer> hoursValue) {
        this.hours = hoursValue;
    }
    
    private ArrayList<Integer> minutes;
    
    /**
    * Optional. Minutes of the hour that the job should execute at.
    * @return The Minutes value.
    */
    public ArrayList<Integer> getMinutes() {
        return this.minutes;
    }
    
    /**
    * Optional. Minutes of the hour that the job should execute at.
    * @param minutesValue The Minutes value.
    */
    public void setMinutes(final ArrayList<Integer> minutesValue) {
        this.minutes = minutesValue;
    }
    
    private ArrayList<Integer> monthDays;
    
    /**
    * Optional. Days of the month that the job should execute on.  Must be
    * between 1 and 31.
    * @return The MonthDays value.
    */
    public ArrayList<Integer> getMonthDays() {
        return this.monthDays;
    }
    
    /**
    * Optional. Days of the month that the job should execute on.  Must be
    * between 1 and 31.
    * @param monthDaysValue The MonthDays value.
    */
    public void setMonthDays(final ArrayList<Integer> monthDaysValue) {
        this.monthDays = monthDaysValue;
    }
    
    private ArrayList<JobScheduleMonthlyOccurrence> monthlyOccurrences;
    
    /**
    * Optional. Occurrences of days within a month.
    * @return The MonthlyOccurrences value.
    */
    public ArrayList<JobScheduleMonthlyOccurrence> getMonthlyOccurrences() {
        return this.monthlyOccurrences;
    }
    
    /**
    * Optional. Occurrences of days within a month.
    * @param monthlyOccurrencesValue The MonthlyOccurrences value.
    */
    public void setMonthlyOccurrences(final ArrayList<JobScheduleMonthlyOccurrence> monthlyOccurrencesValue) {
        this.monthlyOccurrences = monthlyOccurrencesValue;
    }
    
    private ArrayList<Integer> months;
    
    /**
    * Optional. Months that the job should execute in.  Must be between 1 and
    * 12.
    * @return The Months value.
    */
    public ArrayList<Integer> getMonths() {
        return this.months;
    }
    
    /**
    * Optional. Months that the job should execute in.  Must be between 1 and
    * 12.
    * @param monthsValue The Months value.
    */
    public void setMonths(final ArrayList<Integer> monthsValue) {
        this.months = monthsValue;
    }
    
    /**
    * Initializes a new instance of the JobRecurrenceSchedule class.
    *
    */
    public JobRecurrenceSchedule() {
        this.days = new ArrayList<JobScheduleDay>();
        this.hours = new ArrayList<Integer>();
        this.minutes = new ArrayList<Integer>();
        this.monthDays = new ArrayList<Integer>();
        this.monthlyOccurrences = new ArrayList<JobScheduleMonthlyOccurrence>();
        this.months = new ArrayList<Integer>();
    }
}
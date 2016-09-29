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

package com.microsoft.azure.management.websites.models;

/**
* Represents the properties of a Web Hosting Plan.
*/
public class WebHostingPlanProperties {
    private String adminSiteName;
    
    /**
    * Optional. The admin site. The admin site is used to deploy site
    * extensions or contents shared by all site in the plan.
    * @return The AdminSiteName value.
    */
    public String getAdminSiteName() {
        return this.adminSiteName;
    }
    
    /**
    * Optional. The admin site. The admin site is used to deploy site
    * extensions or contents shared by all site in the plan.
    * @param adminSiteNameValue The AdminSiteName value.
    */
    public void setAdminSiteName(final String adminSiteNameValue) {
        this.adminSiteName = adminSiteNameValue;
    }
    
    private int numberOfWorkers;
    
    /**
    * Optional. The instance count, which is the number of virtual machines
    * dedicated to the Web Hosting Plan. Supported values are positive
    * integers.
    * @return The NumberOfWorkers value.
    */
    public int getNumberOfWorkers() {
        return this.numberOfWorkers;
    }
    
    /**
    * Optional. The instance count, which is the number of virtual machines
    * dedicated to the Web Hosting Plan. Supported values are positive
    * integers.
    * @param numberOfWorkersValue The NumberOfWorkers value.
    */
    public void setNumberOfWorkers(final int numberOfWorkersValue) {
        this.numberOfWorkers = numberOfWorkersValue;
    }
    
    private SkuOptions sku;
    
    /**
    * Optional. The Web Hosting Plan SKU.
    * @return The Sku value.
    */
    public SkuOptions getSku() {
        return this.sku;
    }
    
    /**
    * Optional. The Web Hosting Plan SKU.
    * @param skuValue The Sku value.
    */
    public void setSku(final SkuOptions skuValue) {
        this.sku = skuValue;
    }
    
    private WorkerSizeOptions workerSize;
    
    /**
    * Optional. The instance size. Possible values are Small, Medium, or Large.
    * @return The WorkerSize value.
    */
    public WorkerSizeOptions getWorkerSize() {
        return this.workerSize;
    }
    
    /**
    * Optional. The instance size. Possible values are Small, Medium, or Large.
    * @param workerSizeValue The WorkerSize value.
    */
    public void setWorkerSize(final WorkerSizeOptions workerSizeValue) {
        this.workerSize = workerSizeValue;
    }
}
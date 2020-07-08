package org.binaryitplanet.rentalreminderapp.Features.Presentar

import org.binaryitplanet.rentalreminderapp.Utils.OldTenantUtils
import org.binaryitplanet.rentalreminderapp.Utils.PropertyUtils
import org.binaryitplanet.rentalreminderapp.Utils.TenantUtils

interface OldTenantPresentar {
    fun fetchData(){}
    fun saveData(oldTenantUtils: OldTenantUtils){}
    fun deleteData(oldTenantUtils: OldTenantUtils, propertyUtils: PropertyUtils, tenantUtils: TenantUtils){}
    fun updateData(tenantUtils: TenantUtils){}
    fun fetchDataById(id: Long){}
    fun fetchDataByBuildingId(id: Long){}

    fun totalRantReceivedThisMonth(){}

    fun buildingList(){}
}
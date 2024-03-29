package org.binaryitplanet.rentalreminderapp.Features.Model

import androidx.room.*
import org.binaryitplanet.rentalreminderapp.Utils.TenantUtils


@Dao
interface TenantDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(tenant: TenantUtils)


    @Update
    fun update(tenant: TenantUtils)

    @Delete
    fun delete(tenant: TenantUtils)

    @Query("SELECT * FROM Tenants WHERE ID == :id")
    fun getTenantById(id: Long): TenantUtils


    @Query("SELECT * FROM Tenants")
    fun getAllTenants(): List<TenantUtils>

    @Query("SELECT * FROM Tenants WHERE Building_ID == :buildingId")
    fun getTenantByBuildingId(buildingId: Long): TenantUtils

    @Query("DELETE FROM Tenants WHERE ID == :id")
    fun deleteTenantById(id: Long): Int


//
//    @Query("SELECT DISTINCT Building_Name FROM Tenants ORDER BY Building_Name ASC")
//    fun getAllBuildings(): List<String>
//
//
//    @Query("SELECT * FROM Tenants WHERE Property_Status == :propertyStatus ORDER BY Building_Name ASC")
//    fun getAllTenantsByType(propertyStatus: Boolean): List<TenantUtils>
//
//    @Query("SELECT COUNT(ID) FROM Tenants WHERE Property_Status == :status")
//    fun countTotalPropertyByStatus(status: Boolean): Int

}
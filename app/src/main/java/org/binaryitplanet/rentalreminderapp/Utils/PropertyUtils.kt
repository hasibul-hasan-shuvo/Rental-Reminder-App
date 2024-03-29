package org.binaryitplanet.rentalreminderapp.Utils

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = Config.TABLE_NAME_PROPERTY)
data class PropertyUtils(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Config.COLUMN_ID)
    val id: Long?,

    @ColumnInfo(name = Config.COLUMN_BUILDING_NAME)
    var buildingName: String,

    @ColumnInfo(name = Config.COLUMN_TENANT_NAME)
    var tenantName: String?,

    @ColumnInfo(name = Config.COLUMN_PHONE_NUMBER)
    var phoneNumber: String?,

    @ColumnInfo(name = Config.COLUMN_PROPERTY_STATUS)
    var propertyStatus: Boolean,

    @ColumnInfo(name = Config.COLUMN_LAST_RENT_RECEIVED)
    var lastRant: String?,

    @ColumnInfo(name = Config.COLUMN_LAST_ADDRESS)
    var address: String?,

    @ColumnInfo(name = Config.COLUMN_RENEW_DATE)
    var renewDate: String?
): Serializable {
}
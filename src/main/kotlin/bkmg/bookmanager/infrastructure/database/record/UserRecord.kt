/*
 * Auto-generated file. Created by MyBatis Generator
 */
package bkmg.bookmanager.infrastructure.database.record

import bkmg.bookmanager.domain.enum.RoleType

data class UserRecord(
    var id: Long? = null,
    var email: String? = null,
    var password: String? = null,
    var name: String? = null,
    var roleType: RoleType? = null
)
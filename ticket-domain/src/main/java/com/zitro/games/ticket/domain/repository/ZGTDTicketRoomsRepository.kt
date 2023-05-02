package com.zitro.games.ticket.domain.repository

import com.zitro.games.ticket.domain.entity.rooms.ZGTDTicketRoomsRequest
import com.zitro.games.ticket.domain.entity.rooms.ZGTDTicketRoomsResponse
import kotlinx.coroutines.flow.Flow

interface ZGTDTicketRoomsRepository {
    fun getRooms(request: ZGTDTicketRoomsRequest): Flow<List<ZGTDTicketRoomsResponse>>
}
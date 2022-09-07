package com.disney.disneycharacters.mapper.mapstruct;

import com.disney.disneycharacters.model.dto.actor.ActorDetailDto;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.dto.actor.ActorPostDto;
import com.disney.disneycharacters.model.entity.Actor;
import org.mapstruct.*;

@Mapper( componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface ActorMapper {

    @Mapping( target = "id", source = "actorId" )
    ActorDetailDto actorToActorDetailDto( Actor actor );

    @Mapping( target = "actorId", source = "id" )
    Actor actorDetailDtoToActor( ActorDetailDto actor );

    Actor actorPostToActor( ActorPostDto actor );

    /*ActorPostDto actorToActorPost( Actor actor );

    ActorPatchDto actorToActorPatch( Actor actor );*/


    @BeanMapping( nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
    void actorPatchToActor( ActorPatchDto actorPatchDto, @MappingTarget Actor actor );
}

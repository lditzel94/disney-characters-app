package com.disney.disneycharacters.mapper.mapstruct;

import com.disney.disneycharacters.model.dto.actor.ActorDetailDto;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.dto.actor.ActorPostDto;
import com.disney.disneycharacters.model.entity.Actor;
import org.mapstruct.*;

@Mapper( componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface ActorMapper {

    @Mapping( target = "id", source = "actorId" )
    ActorDetailDto actorToActorDetail( Actor actor );

    Actor actorPostToActor( ActorPostDto actor );

    @BeanMapping( nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
    void actorPatchToActor( ActorPatchDto actorPatchDto, @MappingTarget Actor actor );
}

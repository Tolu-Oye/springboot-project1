package net.javaguides.organizationservice.mapper;

import net.javaguides.organizationservice.dto.OrganizationDto;
import net.javaguides.organizationservice.entity.Organization;

public class OrganizationMapper {

    public static OrganizationDto mapToOrganizationDto(Organization organization){

        OrganizationDto organizationDto = new OrganizationDto(
                organization.getId(),
                organization.getOrganizationName(),
                organization.getOrganizationDesc(),
                organization.getOrganizationCode(),
                organization.getCreatedDate()
        );

        return organizationDto;

    }

    public static Organization mapToOrganization(OrganizationDto organizationDto){

        Organization organization = new Organization(
                organizationDto.getId(),
                organizationDto.getOrganizationName(),
                organizationDto.getOrganizationDesc(),
                organizationDto.getOrganizationCode(),
                organizationDto.getCreatedDate()
        );

        return organization;

    }
}



# coding: utf-8

# flake8: noqa
"""
    Transport Department, West Bengal

    Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


# import models into model package
from openapi_client.models.academic_certificate_schema import AcademicCertificateSchema
from openapi_client.models.academic_certificate_schema_certificate_data import AcademicCertificateSchemaCertificateData
from openapi_client.models.academic_certificate_schema_certificate_data_examination import AcademicCertificateSchemaCertificateDataExamination
from openapi_client.models.academic_certificate_schema_certificate_data_performance import AcademicCertificateSchemaCertificateDataPerformance
from openapi_client.models.academic_certificate_schema_certificate_data_performance_subjects_inner import AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner
from openapi_client.models.academic_certificate_schema_certificate_data_school import AcademicCertificateSchemaCertificateDataSchool
from openapi_client.models.academic_certificate_schema_issued_by import AcademicCertificateSchemaIssuedBy
from openapi_client.models.academic_certificate_schema_issued_by_organization import AcademicCertificateSchemaIssuedByOrganization
from openapi_client.models.academic_certificate_schema_issued_by_organization_address import AcademicCertificateSchemaIssuedByOrganizationAddress
from openapi_client.models.academic_certificate_schema_issued_to import AcademicCertificateSchemaIssuedTo
from openapi_client.models.academic_certificate_schema_issued_to_person import AcademicCertificateSchemaIssuedToPerson
from openapi_client.models.academic_certificate_schema_issued_to_person_address import AcademicCertificateSchemaIssuedToPersonAddress
from openapi_client.models.academic_certificate_schema_issued_to_person_photo import AcademicCertificateSchemaIssuedToPersonPhoto
from openapi_client.models.consent_artifact_schema import ConsentArtifactSchema
from openapi_client.models.consent_artifact_schema_consent import ConsentArtifactSchemaConsent
from openapi_client.models.consent_artifact_schema_consent_data import ConsentArtifactSchemaConsentData
from openapi_client.models.consent_artifact_schema_consent_permission import ConsentArtifactSchemaConsentPermission
from openapi_client.models.consent_artifact_schema_consent_permission_date_range import ConsentArtifactSchemaConsentPermissionDateRange
from openapi_client.models.consent_artifact_schema_consent_permission_frequency import ConsentArtifactSchemaConsentPermissionFrequency
from openapi_client.models.consent_artifact_schema_consent_purpose import ConsentArtifactSchemaConsentPurpose
from openapi_client.models.consent_artifact_schema_consent_user import ConsentArtifactSchemaConsentUser
from openapi_client.models.consent_artifact_schema_signature import ConsentArtifactSchemaSignature
from openapi_client.models.driving_license_schema import DrivingLicenseSchema
from openapi_client.models.driving_license_schema_certificate_data import DrivingLicenseSchemaCertificateData
from openapi_client.models.driving_license_schema_certificate_data_driving_license import DrivingLicenseSchemaCertificateDataDrivingLicense
from openapi_client.models.driving_license_schema_issued_by import DrivingLicenseSchemaIssuedBy
from openapi_client.models.driving_license_schema_issued_by_organization import DrivingLicenseSchemaIssuedByOrganization
from openapi_client.models.driving_license_schema_issued_by_organization_address import DrivingLicenseSchemaIssuedByOrganizationAddress
from openapi_client.models.driving_license_schema_issued_to import DrivingLicenseSchemaIssuedTo
from openapi_client.models.driving_license_schema_issued_to_person import DrivingLicenseSchemaIssuedToPerson
from openapi_client.models.drvlc400_response import Drvlc400Response
from openapi_client.models.drvlc401_response import Drvlc401Response
from openapi_client.models.drvlc404_response import Drvlc404Response
from openapi_client.models.drvlc500_response import Drvlc500Response
from openapi_client.models.drvlc502_response import Drvlc502Response
from openapi_client.models.drvlc503_response import Drvlc503Response
from openapi_client.models.drvlc504_response import Drvlc504Response
from openapi_client.models.drvlc_request import DrvlcRequest
from openapi_client.models.drvlc_request_certificate_parameters import DrvlcRequestCertificateParameters
from openapi_client.models.rvcer_request import RvcerRequest
from openapi_client.models.rvcer_request_certificate_parameters import RvcerRequestCertificateParameters
from openapi_client.models.vehicle_registration_schema import VehicleRegistrationSchema
from openapi_client.models.vehicle_registration_schema_certificate_data import VehicleRegistrationSchemaCertificateData
from openapi_client.models.vehicle_registration_schema_certificate_data_vehicle_registration import VehicleRegistrationSchemaCertificateDataVehicleRegistration
from openapi_client.models.vehicle_registration_schema_certificate_data_vehicle_registration_insurance import VehicleRegistrationSchemaCertificateDataVehicleRegistrationInsurance
from openapi_client.models.vehicle_registration_schema_certificate_data_vehicle_registration_vehicle import VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle
from openapi_client.models.vehicle_registration_schema_issued_by import VehicleRegistrationSchemaIssuedBy
from openapi_client.models.vehicle_registration_schema_issued_by_organization import VehicleRegistrationSchemaIssuedByOrganization
from openapi_client.models.vehicle_registration_schema_issued_to import VehicleRegistrationSchemaIssuedTo
from openapi_client.models.vehicle_registration_schema_issued_to_person import VehicleRegistrationSchemaIssuedToPerson

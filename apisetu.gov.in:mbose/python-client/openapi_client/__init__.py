# coding: utf-8

# flake8: noqa

"""
    Meghalaya Board of School Education, Tura, Meghalaya

    Meghalaya Board of School Education (MBOSE) with Marksheets of Class Xth and Class XIIth (Arts , Science, Commerce and Vocational), is availablke on DigiLocker for the students of 2015-2019.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


__version__ = "1.0.0"

# import apis into sdk package
from openapi_client.api.apis_api import APIsApi

# import ApiClient
from openapi_client.api_response import ApiResponse
from openapi_client.api_client import ApiClient
from openapi_client.configuration import Configuration
from openapi_client.exceptions import OpenApiException
from openapi_client.exceptions import ApiTypeError
from openapi_client.exceptions import ApiValueError
from openapi_client.exceptions import ApiKeyError
from openapi_client.exceptions import ApiAttributeError
from openapi_client.exceptions import ApiException

# import models into sdk package
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
from openapi_client.models.hscer400_response import Hscer400Response
from openapi_client.models.hscer401_response import Hscer401Response
from openapi_client.models.hscer404_response import Hscer404Response
from openapi_client.models.hscer500_response import Hscer500Response
from openapi_client.models.hscer502_response import Hscer502Response
from openapi_client.models.hscer503_response import Hscer503Response
from openapi_client.models.hscer504_response import Hscer504Response
from openapi_client.models.hscer_request import HscerRequest
from openapi_client.models.hscer_request_certificate_parameters import HscerRequestCertificateParameters

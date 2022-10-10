# coding: utf-8

"""
    Punjab State eGovernance Society, Punjab

    eDistrict Punjab (http://edistrict.punjabgovt.gov.in) is the online service delivery portal for Punjab State Govt. Certain documents issued by it (e.g. Residence, SC/ST, OBC Certificates etc) can be pulled into citizens' DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.consent_artifact_schema import ConsentArtifactSchema

class TestConsentArtifactSchema(unittest.TestCase):
    """ConsentArtifactSchema unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConsentArtifactSchema:
        """Test ConsentArtifactSchema
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConsentArtifactSchema`
        """
        model = ConsentArtifactSchema()
        if include_optional:
            return ConsentArtifactSchema(
                consent = openapi_client.models.consent_artifact_schema_consent.ConsentArtifactSchema_consent(
                    consent_id = 'ea9c43aa-7f5a-4bf3-a0be-e1caa24737ba', 
                    data = openapi_client.models.consent_artifact_schema_consent_data.ConsentArtifactSchema_consent_data(
                        id = '0', ), 
                    data_consumer = openapi_client.models.consent_artifact_schema_consent_data.ConsentArtifactSchema_consent_data(
                        id = '0', ), 
                    data_provider = , 
                    permission = openapi_client.models.consent_artifact_schema_consent_permission.ConsentArtifactSchema_consent_permission(
                        access = '0', 
                        date_range = openapi_client.models.consent_artifact_schema_consent_permission_date_range.ConsentArtifactSchema_consent_permission_dateRange(
                            from = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            to = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), 
                        frequency = openapi_client.models.consent_artifact_schema_consent_permission_frequency.ConsentArtifactSchema_consent_permission_frequency(
                            repeats = 1.337, 
                            unit = '0', 
                            value = 1.337, ), ), 
                    purpose = openapi_client.models.consent_artifact_schema_consent_purpose.ConsentArtifactSchema_consent_purpose(
                        description = '0', ), 
                    timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    user = openapi_client.models.consent_artifact_schema_consent_user.ConsentArtifactSchema_consent_user(
                        email = '0', 
                        id_number = '0', 
                        id_type = '0', 
                        mobile = '0', ), ),
                signature = openapi_client.models.consent_artifact_schema_signature.ConsentArtifactSchema_signature(
                    signature = '', )
            )
        else:
            return ConsentArtifactSchema(
                consent = openapi_client.models.consent_artifact_schema_consent.ConsentArtifactSchema_consent(
                    consent_id = 'ea9c43aa-7f5a-4bf3-a0be-e1caa24737ba', 
                    data = openapi_client.models.consent_artifact_schema_consent_data.ConsentArtifactSchema_consent_data(
                        id = '0', ), 
                    data_consumer = openapi_client.models.consent_artifact_schema_consent_data.ConsentArtifactSchema_consent_data(
                        id = '0', ), 
                    data_provider = , 
                    permission = openapi_client.models.consent_artifact_schema_consent_permission.ConsentArtifactSchema_consent_permission(
                        access = '0', 
                        date_range = openapi_client.models.consent_artifact_schema_consent_permission_date_range.ConsentArtifactSchema_consent_permission_dateRange(
                            from = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            to = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), 
                        frequency = openapi_client.models.consent_artifact_schema_consent_permission_frequency.ConsentArtifactSchema_consent_permission_frequency(
                            repeats = 1.337, 
                            unit = '0', 
                            value = 1.337, ), ), 
                    purpose = openapi_client.models.consent_artifact_schema_consent_purpose.ConsentArtifactSchema_consent_purpose(
                        description = '0', ), 
                    timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    user = openapi_client.models.consent_artifact_schema_consent_user.ConsentArtifactSchema_consent_user(
                        email = '0', 
                        id_number = '0', 
                        id_type = '0', 
                        mobile = '0', ), ),
                signature = openapi_client.models.consent_artifact_schema_signature.ConsentArtifactSchema_signature(
                    signature = '', ),
        )
        """

    def testConsentArtifactSchema(self):
        """Test ConsentArtifactSchema"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

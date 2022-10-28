# coding: utf-8

"""
    Transport Department, West Bengal

    Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.consent_artifact_schema_consent_permission_frequency import ConsentArtifactSchemaConsentPermissionFrequency

class TestConsentArtifactSchemaConsentPermissionFrequency(unittest.TestCase):
    """ConsentArtifactSchemaConsentPermissionFrequency unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConsentArtifactSchemaConsentPermissionFrequency:
        """Test ConsentArtifactSchemaConsentPermissionFrequency
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConsentArtifactSchemaConsentPermissionFrequency`
        """
        model = ConsentArtifactSchemaConsentPermissionFrequency()
        if include_optional:
            return ConsentArtifactSchemaConsentPermissionFrequency(
                repeats = 1.337,
                unit = '0',
                value = 1.337
            )
        else:
            return ConsentArtifactSchemaConsentPermissionFrequency(
                repeats = 1.337,
                unit = '0',
                value = 1.337,
        )
        """

    def testConsentArtifactSchemaConsentPermissionFrequency(self):
        """Test ConsentArtifactSchemaConsentPermissionFrequency"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

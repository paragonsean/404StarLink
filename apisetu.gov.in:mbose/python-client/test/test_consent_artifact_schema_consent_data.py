# coding: utf-8

"""
    Meghalaya Board of School Education, Tura, Meghalaya

    Meghalaya Board of School Education (MBOSE) with Marksheets of Class Xth and Class XIIth (Arts , Science, Commerce and Vocational), is availablke on DigiLocker for the students of 2015-2019.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.consent_artifact_schema_consent_data import ConsentArtifactSchemaConsentData

class TestConsentArtifactSchemaConsentData(unittest.TestCase):
    """ConsentArtifactSchemaConsentData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConsentArtifactSchemaConsentData:
        """Test ConsentArtifactSchemaConsentData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConsentArtifactSchemaConsentData`
        """
        model = ConsentArtifactSchemaConsentData()
        if include_optional:
            return ConsentArtifactSchemaConsentData(
                id = '0'
            )
        else:
            return ConsentArtifactSchemaConsentData(
                id = '0',
        )
        """

    def testConsentArtifactSchemaConsentData(self):
        """Test ConsentArtifactSchemaConsentData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

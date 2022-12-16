# coding: utf-8

"""
    Max Life Insurance Co. Ltd.

    Life Insurance policies issued by Max Life Insurance on or after April 1st,2008 are available to be pulled in citizen's DigiLocker account.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.consent_artifact_schema_consent_purpose import ConsentArtifactSchemaConsentPurpose

class TestConsentArtifactSchemaConsentPurpose(unittest.TestCase):
    """ConsentArtifactSchemaConsentPurpose unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConsentArtifactSchemaConsentPurpose:
        """Test ConsentArtifactSchemaConsentPurpose
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConsentArtifactSchemaConsentPurpose`
        """
        model = ConsentArtifactSchemaConsentPurpose()
        if include_optional:
            return ConsentArtifactSchemaConsentPurpose(
                description = '0'
            )
        else:
            return ConsentArtifactSchemaConsentPurpose(
                description = '0',
        )
        """

    def testConsentArtifactSchemaConsentPurpose(self):
        """Test ConsentArtifactSchemaConsentPurpose"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

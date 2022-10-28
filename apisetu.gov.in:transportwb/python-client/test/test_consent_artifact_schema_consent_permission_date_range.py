# coding: utf-8

"""
    Transport Department, West Bengal

    Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.consent_artifact_schema_consent_permission_date_range import ConsentArtifactSchemaConsentPermissionDateRange

class TestConsentArtifactSchemaConsentPermissionDateRange(unittest.TestCase):
    """ConsentArtifactSchemaConsentPermissionDateRange unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConsentArtifactSchemaConsentPermissionDateRange:
        """Test ConsentArtifactSchemaConsentPermissionDateRange
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConsentArtifactSchemaConsentPermissionDateRange`
        """
        model = ConsentArtifactSchemaConsentPermissionDateRange()
        if include_optional:
            return ConsentArtifactSchemaConsentPermissionDateRange(
                var_from = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                to = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f')
            )
        else:
            return ConsentArtifactSchemaConsentPermissionDateRange(
                var_from = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                to = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
        )
        """

    def testConsentArtifactSchemaConsentPermissionDateRange(self):
        """Test ConsentArtifactSchemaConsentPermissionDateRange"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.google_api_serviceusage_v1beta1_service_identity import GoogleApiServiceusageV1beta1ServiceIdentity

class TestGoogleApiServiceusageV1beta1ServiceIdentity(unittest.TestCase):
    """GoogleApiServiceusageV1beta1ServiceIdentity unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GoogleApiServiceusageV1beta1ServiceIdentity:
        """Test GoogleApiServiceusageV1beta1ServiceIdentity
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GoogleApiServiceusageV1beta1ServiceIdentity`
        """
        model = GoogleApiServiceusageV1beta1ServiceIdentity()
        if include_optional:
            return GoogleApiServiceusageV1beta1ServiceIdentity(
                email = '',
                unique_id = ''
            )
        else:
            return GoogleApiServiceusageV1beta1ServiceIdentity(
        )
        """

    def testGoogleApiServiceusageV1beta1ServiceIdentity(self):
        """Test GoogleApiServiceusageV1beta1ServiceIdentity"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request import OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest

class TestOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest(unittest.TestCase):
    """OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest:
        """Test OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest`
        """
        model = OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest()
        if include_optional:
            return OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest(
                client_secret = '',
                note = 'Update all gems',
                note_url = '',
                scopes = ["public_repo","user"]
            )
        else:
            return OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest(
                client_secret = '',
        )
        """

    def testOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest(self):
        """Test OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

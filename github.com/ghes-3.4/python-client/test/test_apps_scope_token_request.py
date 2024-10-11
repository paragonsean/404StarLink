# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.apps_scope_token_request import AppsScopeTokenRequest

class TestAppsScopeTokenRequest(unittest.TestCase):
    """AppsScopeTokenRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppsScopeTokenRequest:
        """Test AppsScopeTokenRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppsScopeTokenRequest`
        """
        model = AppsScopeTokenRequest()
        if include_optional:
            return AppsScopeTokenRequest(
                access_token = 'e72e16c7e42f292c6912e7710c838347ae178b4a',
                permissions = {"contents":"read","deployments":"write","issues":"read","single_file":"read"},
                repositories = [
                    'rails'
                    ],
                repository_ids = [1],
                target = 'octocat',
                target_id = 1
            )
        else:
            return AppsScopeTokenRequest(
                access_token = 'e72e16c7e42f292c6912e7710c838347ae178b4a',
        )
        """

    def testAppsScopeTokenRequest(self):
        """Test AppsScopeTokenRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.actions_create_or_update_org_secret_request import ActionsCreateOrUpdateOrgSecretRequest

class TestActionsCreateOrUpdateOrgSecretRequest(unittest.TestCase):
    """ActionsCreateOrUpdateOrgSecretRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ActionsCreateOrUpdateOrgSecretRequest:
        """Test ActionsCreateOrUpdateOrgSecretRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ActionsCreateOrUpdateOrgSecretRequest`
        """
        model = ActionsCreateOrUpdateOrgSecretRequest()
        if include_optional:
            return ActionsCreateOrUpdateOrgSecretRequest(
                encrypted_value = 'zA9LCSLv1C1ylmgd0/Y2TA5TkIRHRRA401iz1CiIykN3HUO6XMsJPGh8AsaLONiNuo2ZPKNpkAmJHONf1Elbsh0SQR//',
                key_id = '',
                selected_repository_ids = [
                    56
                    ],
                visibility = 'all'
            )
        else:
            return ActionsCreateOrUpdateOrgSecretRequest(
                visibility = 'all',
        )
        """

    def testActionsCreateOrUpdateOrgSecretRequest(self):
        """Test ActionsCreateOrUpdateOrgSecretRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

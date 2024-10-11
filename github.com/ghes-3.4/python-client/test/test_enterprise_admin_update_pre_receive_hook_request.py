# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.enterprise_admin_update_pre_receive_hook_request import EnterpriseAdminUpdatePreReceiveHookRequest

class TestEnterpriseAdminUpdatePreReceiveHookRequest(unittest.TestCase):
    """EnterpriseAdminUpdatePreReceiveHookRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EnterpriseAdminUpdatePreReceiveHookRequest:
        """Test EnterpriseAdminUpdatePreReceiveHookRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EnterpriseAdminUpdatePreReceiveHookRequest`
        """
        model = EnterpriseAdminUpdatePreReceiveHookRequest()
        if include_optional:
            return EnterpriseAdminUpdatePreReceiveHookRequest(
                allow_downstream_configuration = True,
                enforcement = '',
                environment = { },
                name = '',
                script = '',
                script_repository = { }
            )
        else:
            return EnterpriseAdminUpdatePreReceiveHookRequest(
        )
        """

    def testEnterpriseAdminUpdatePreReceiveHookRequest(self):
        """Test EnterpriseAdminUpdatePreReceiveHookRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

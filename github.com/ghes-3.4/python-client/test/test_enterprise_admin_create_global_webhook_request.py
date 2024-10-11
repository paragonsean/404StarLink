# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.enterprise_admin_create_global_webhook_request import EnterpriseAdminCreateGlobalWebhookRequest

class TestEnterpriseAdminCreateGlobalWebhookRequest(unittest.TestCase):
    """EnterpriseAdminCreateGlobalWebhookRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EnterpriseAdminCreateGlobalWebhookRequest:
        """Test EnterpriseAdminCreateGlobalWebhookRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EnterpriseAdminCreateGlobalWebhookRequest`
        """
        model = EnterpriseAdminCreateGlobalWebhookRequest()
        if include_optional:
            return EnterpriseAdminCreateGlobalWebhookRequest(
                active = True,
                config = openapi_client.models.enterprise_admin_create_global_webhook_request_config.enterprise_admin_create_global_webhook_request_config(
                    content_type = '', 
                    insecure_ssl = '', 
                    secret = '', 
                    url = '', ),
                events = [
                    ''
                    ],
                name = ''
            )
        else:
            return EnterpriseAdminCreateGlobalWebhookRequest(
                config = openapi_client.models.enterprise_admin_create_global_webhook_request_config.enterprise_admin_create_global_webhook_request_config(
                    content_type = '', 
                    insecure_ssl = '', 
                    secret = '', 
                    url = '', ),
                name = '',
        )
        """

    def testEnterpriseAdminCreateGlobalWebhookRequest(self):
        """Test EnterpriseAdminCreateGlobalWebhookRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

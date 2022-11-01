# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.orgs_create_webhook_request import OrgsCreateWebhookRequest

class TestOrgsCreateWebhookRequest(unittest.TestCase):
    """OrgsCreateWebhookRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrgsCreateWebhookRequest:
        """Test OrgsCreateWebhookRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrgsCreateWebhookRequest`
        """
        model = OrgsCreateWebhookRequest()
        if include_optional:
            return OrgsCreateWebhookRequest(
                active = True,
                config = openapi_client.models.orgs_create_webhook_request_config.orgs_create_webhook_request_config(
                    content_type = '"json"', 
                    insecure_ssl = null, 
                    password = '"password"', 
                    secret = '"********"', 
                    url = 'https://example.com/webhook', 
                    username = '"kdaigle"', ),
                events = [
                    ''
                    ],
                name = ''
            )
        else:
            return OrgsCreateWebhookRequest(
                config = openapi_client.models.orgs_create_webhook_request_config.orgs_create_webhook_request_config(
                    content_type = '"json"', 
                    insecure_ssl = null, 
                    password = '"password"', 
                    secret = '"********"', 
                    url = 'https://example.com/webhook', 
                    username = '"kdaigle"', ),
                name = '',
        )
        """

    def testOrgsCreateWebhookRequest(self):
        """Test OrgsCreateWebhookRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

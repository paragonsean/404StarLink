# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.webhook_config import WebhookConfig

class TestWebhookConfig(unittest.TestCase):
    """WebhookConfig unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> WebhookConfig:
        """Test WebhookConfig
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `WebhookConfig`
        """
        model = WebhookConfig()
        if include_optional:
            return WebhookConfig(
                secret = '',
                state = 'STATE_UNSPECIFIED'
            )
        else:
            return WebhookConfig(
        )
        """

    def testWebhookConfig(self):
        """Test WebhookConfig"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

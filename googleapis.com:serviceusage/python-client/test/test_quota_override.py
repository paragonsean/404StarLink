# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.quota_override import QuotaOverride

class TestQuotaOverride(unittest.TestCase):
    """QuotaOverride unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> QuotaOverride:
        """Test QuotaOverride
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `QuotaOverride`
        """
        model = QuotaOverride()
        if include_optional:
            return QuotaOverride(
                admin_override_ancestor = '',
                dimensions = {
                    'key' : ''
                    },
                metric = '',
                name = '',
                override_value = '',
                unit = ''
            )
        else:
            return QuotaOverride(
        )
        """

    def testQuotaOverride(self):
        """Test QuotaOverride"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

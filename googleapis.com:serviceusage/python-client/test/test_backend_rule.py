# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.backend_rule import BackendRule

class TestBackendRule(unittest.TestCase):
    """BackendRule unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BackendRule:
        """Test BackendRule
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BackendRule`
        """
        model = BackendRule()
        if include_optional:
            return BackendRule(
                address = '',
                deadline = 1.337,
                disable_auth = True,
                jwt_audience = '',
                min_deadline = 1.337,
                operation_deadline = 1.337,
                overrides_by_request_protocol = {
                    'key' : openapi_client.models.backend_rule.BackendRule(
                        address = '', 
                        deadline = 1.337, 
                        disable_auth = True, 
                        jwt_audience = '', 
                        min_deadline = 1.337, 
                        operation_deadline = 1.337, 
                        path_translation = 'PATH_TRANSLATION_UNSPECIFIED', 
                        protocol = '', 
                        selector = '', )
                    },
                path_translation = 'PATH_TRANSLATION_UNSPECIFIED',
                protocol = '',
                selector = ''
            )
        else:
            return BackendRule(
        )
        """

    def testBackendRule(self):
        """Test BackendRule"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

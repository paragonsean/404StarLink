# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.get_launch_configuration_request import GetLaunchConfigurationRequest

class TestGetLaunchConfigurationRequest(unittest.TestCase):
    """GetLaunchConfigurationRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetLaunchConfigurationRequest:
        """Test GetLaunchConfigurationRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetLaunchConfigurationRequest`
        """
        model = GetLaunchConfigurationRequest()
        if include_optional:
            return GetLaunchConfigurationRequest(
                source_server_id = 's-gCu2LC4aWwWL9Y8640123456789101112131415161718'
            )
        else:
            return GetLaunchConfigurationRequest(
                source_server_id = 's-gCu2LC4aWwWL9Y8640123456789101112131415161718',
        )
        """

    def testGetLaunchConfigurationRequest(self):
        """Test GetLaunchConfigurationRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

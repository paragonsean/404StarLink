# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.device_create_request_data import DeviceCreateRequestData

class TestDeviceCreateRequestData(unittest.TestCase):
    """DeviceCreateRequestData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DeviceCreateRequestData:
        """Test DeviceCreateRequestData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DeviceCreateRequestData`
        """
        model = DeviceCreateRequestData()
        if include_optional:
            return DeviceCreateRequestData(
                attributes = openapi_client.models.device_create_request_data_attributes.DeviceCreateRequest_data_attributes(
                    name = '', 
                    platform = 'IOS', 
                    udid = '', ),
                type = 'devices'
            )
        else:
            return DeviceCreateRequestData(
                attributes = openapi_client.models.device_create_request_data_attributes.DeviceCreateRequest_data_attributes(
                    name = '', 
                    platform = 'IOS', 
                    udid = '', ),
                type = 'devices',
        )
        """

    def testDeviceCreateRequestData(self):
        """Test DeviceCreateRequestData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

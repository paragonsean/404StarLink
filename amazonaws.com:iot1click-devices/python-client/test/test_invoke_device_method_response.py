# coding: utf-8

"""
    AWS IoT 1-Click Devices Service

    Describes all of the AWS IoT 1-Click device-related API operations for the service.  Also provides sample requests, responses, and errors for the supported web services  protocols.

    The version of the OpenAPI document: 2018-05-14
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.invoke_device_method_response import InvokeDeviceMethodResponse

class TestInvokeDeviceMethodResponse(unittest.TestCase):
    """InvokeDeviceMethodResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> InvokeDeviceMethodResponse:
        """Test InvokeDeviceMethodResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `InvokeDeviceMethodResponse`
        """
        model = InvokeDeviceMethodResponse()
        if include_optional:
            return InvokeDeviceMethodResponse(
                device_method_response = None
            )
        else:
            return InvokeDeviceMethodResponse(
        )
        """

    def testInvokeDeviceMethodResponse(self):
        """Test InvokeDeviceMethodResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

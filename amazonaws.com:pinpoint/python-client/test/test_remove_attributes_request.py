# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.remove_attributes_request import RemoveAttributesRequest

class TestRemoveAttributesRequest(unittest.TestCase):
    """RemoveAttributesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RemoveAttributesRequest:
        """Test RemoveAttributesRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RemoveAttributesRequest`
        """
        model = RemoveAttributesRequest()
        if include_optional:
            return RemoveAttributesRequest(
                update_attributes_request = openapi_client.models.remove_attributes_request_update_attributes_request.RemoveAttributes_request_UpdateAttributesRequest(
                    blacklist = null, )
            )
        else:
            return RemoveAttributesRequest(
                update_attributes_request = openapi_client.models.remove_attributes_request_update_attributes_request.RemoveAttributes_request_UpdateAttributesRequest(
                    blacklist = null, ),
        )
        """

    def testRemoveAttributesRequest(self):
        """Test RemoveAttributesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

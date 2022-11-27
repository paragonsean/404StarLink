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

from openapi_client.models.event_dimensions import EventDimensions

class TestEventDimensions(unittest.TestCase):
    """EventDimensions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EventDimensions:
        """Test EventDimensions
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EventDimensions`
        """
        model = EventDimensions()
        if include_optional:
            return EventDimensions(
                attributes = None,
                event_type = None,
                metrics = None
            )
        else:
            return EventDimensions(
        )
        """

    def testEventDimensions(self):
        """Test EventDimensions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

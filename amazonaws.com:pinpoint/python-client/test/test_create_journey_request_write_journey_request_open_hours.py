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

from openapi_client.models.create_journey_request_write_journey_request_open_hours import CreateJourneyRequestWriteJourneyRequestOpenHours

class TestCreateJourneyRequestWriteJourneyRequestOpenHours(unittest.TestCase):
    """CreateJourneyRequestWriteJourneyRequestOpenHours unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateJourneyRequestWriteJourneyRequestOpenHours:
        """Test CreateJourneyRequestWriteJourneyRequestOpenHours
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateJourneyRequestWriteJourneyRequestOpenHours`
        """
        model = CreateJourneyRequestWriteJourneyRequestOpenHours()
        if include_optional:
            return CreateJourneyRequestWriteJourneyRequestOpenHours(
                email = None,
                sms = None,
                push = None,
                voice = None,
                custom = None
            )
        else:
            return CreateJourneyRequestWriteJourneyRequestOpenHours(
        )
        """

    def testCreateJourneyRequestWriteJourneyRequestOpenHours(self):
        """Test CreateJourneyRequestWriteJourneyRequestOpenHours"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

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

from openapi_client.models.create_journey_request_write_journey_request_start_condition import CreateJourneyRequestWriteJourneyRequestStartCondition

class TestCreateJourneyRequestWriteJourneyRequestStartCondition(unittest.TestCase):
    """CreateJourneyRequestWriteJourneyRequestStartCondition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateJourneyRequestWriteJourneyRequestStartCondition:
        """Test CreateJourneyRequestWriteJourneyRequestStartCondition
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateJourneyRequestWriteJourneyRequestStartCondition`
        """
        model = CreateJourneyRequestWriteJourneyRequestStartCondition()
        if include_optional:
            return CreateJourneyRequestWriteJourneyRequestStartCondition(
                description = None,
                event_start_condition = openapi_client.models.event_start_condition.EventStartCondition(
                    event_filter = openapi_client.models.event_filter.EventFilter(
                        dimensions = null, 
                        filter_type = null, ), 
                    segment_id = '', ),
                segment_start_condition = None
            )
        else:
            return CreateJourneyRequestWriteJourneyRequestStartCondition(
        )
        """

    def testCreateJourneyRequestWriteJourneyRequestStartCondition(self):
        """Test CreateJourneyRequestWriteJourneyRequestStartCondition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

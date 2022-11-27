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

from openapi_client.models.update_journey_state_request import UpdateJourneyStateRequest

class TestUpdateJourneyStateRequest(unittest.TestCase):
    """UpdateJourneyStateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateJourneyStateRequest:
        """Test UpdateJourneyStateRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateJourneyStateRequest`
        """
        model = UpdateJourneyStateRequest()
        if include_optional:
            return UpdateJourneyStateRequest(
                journey_state_request = openapi_client.models.update_journey_state_request_journey_state_request.UpdateJourneyState_request_JourneyStateRequest(
                    state = null, )
            )
        else:
            return UpdateJourneyStateRequest(
                journey_state_request = openapi_client.models.update_journey_state_request_journey_state_request.UpdateJourneyState_request_JourneyStateRequest(
                    state = null, ),
        )
        """

    def testUpdateJourneyStateRequest(self):
        """Test UpdateJourneyStateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

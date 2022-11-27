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

from openapi_client.models.journey_execution_activity_metrics_response import JourneyExecutionActivityMetricsResponse

class TestJourneyExecutionActivityMetricsResponse(unittest.TestCase):
    """JourneyExecutionActivityMetricsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> JourneyExecutionActivityMetricsResponse:
        """Test JourneyExecutionActivityMetricsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `JourneyExecutionActivityMetricsResponse`
        """
        model = JourneyExecutionActivityMetricsResponse()
        if include_optional:
            return JourneyExecutionActivityMetricsResponse(
                activity_type = None,
                application_id = None,
                journey_activity_id = None,
                journey_id = None,
                last_evaluated_time = None,
                metrics = None
            )
        else:
            return JourneyExecutionActivityMetricsResponse(
                activity_type = None,
                application_id = None,
                journey_activity_id = None,
                journey_id = None,
                last_evaluated_time = None,
                metrics = None,
        )
        """

    def testJourneyExecutionActivityMetricsResponse(self):
        """Test JourneyExecutionActivityMetricsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

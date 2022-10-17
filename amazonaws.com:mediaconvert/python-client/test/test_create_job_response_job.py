# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.create_job_response_job import CreateJobResponseJob

class TestCreateJobResponseJob(unittest.TestCase):
    """CreateJobResponseJob unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateJobResponseJob:
        """Test CreateJobResponseJob
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateJobResponseJob`
        """
        model = CreateJobResponseJob()
        if include_optional:
            return CreateJobResponseJob(
                acceleration_settings = None,
                acceleration_status = None,
                arn = None,
                billing_tags_source = None,
                client_request_token = None,
                created_at = None,
                current_phase = None,
                error_code = None,
                error_message = None,
                hop_destinations = None,
                id = None,
                job_percent_complete = None,
                job_template = None,
                messages = None,
                output_group_details = None,
                priority = None,
                queue = None,
                queue_transitions = None,
                retry_count = None,
                role = None,
                settings = None,
                simulate_reserved_queue = None,
                status = None,
                status_update_interval = None,
                timing = None,
                user_metadata = None,
                warnings = None
            )
        else:
            return CreateJobResponseJob(
                role = None,
                settings = None,
        )
        """

    def testCreateJobResponseJob(self):
        """Test CreateJobResponseJob"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.checks_create_request import ChecksCreateRequest

class TestChecksCreateRequest(unittest.TestCase):
    """ChecksCreateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ChecksCreateRequest:
        """Test ChecksCreateRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ChecksCreateRequest`
        """
        model = ChecksCreateRequest()
        if include_optional:
            return ChecksCreateRequest(
                actions = [
                    openapi_client.models.checks_create_request_actions_inner.checks_create_request_actions_inner(
                        description = '', 
                        identifier = '', 
                        label = '', )
                    ],
                completed_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                conclusion = 'action_required',
                details_url = '',
                external_id = '',
                head_sha = '',
                name = '',
                output = openapi_client.models.checks_create_request_output.checks_create_request_output(
                    annotations = [
                        openapi_client.models.checks_create_request_output_annotations_inner.checks_create_request_output_annotations_inner(
                            annotation_level = 'notice', 
                            end_column = 56, 
                            end_line = 56, 
                            message = '', 
                            path = '', 
                            raw_details = '', 
                            start_column = 56, 
                            start_line = 56, 
                            title = '', )
                        ], 
                    images = [
                        openapi_client.models.checks_create_request_output_images_inner.checks_create_request_output_images_inner(
                            alt = '', 
                            caption = '', 
                            image_url = '', )
                        ], 
                    summary = '', 
                    text = '', 
                    title = '', ),
                started_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                status = 'queued'
            )
        else:
            return ChecksCreateRequest(
                head_sha = '',
                name = '',
        )
        """

    def testChecksCreateRequest(self):
        """Test ChecksCreateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

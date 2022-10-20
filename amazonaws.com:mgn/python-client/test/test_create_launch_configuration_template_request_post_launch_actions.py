# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.create_launch_configuration_template_request_post_launch_actions import CreateLaunchConfigurationTemplateRequestPostLaunchActions

class TestCreateLaunchConfigurationTemplateRequestPostLaunchActions(unittest.TestCase):
    """CreateLaunchConfigurationTemplateRequestPostLaunchActions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateLaunchConfigurationTemplateRequestPostLaunchActions:
        """Test CreateLaunchConfigurationTemplateRequestPostLaunchActions
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateLaunchConfigurationTemplateRequestPostLaunchActions`
        """
        model = CreateLaunchConfigurationTemplateRequestPostLaunchActions()
        if include_optional:
            return CreateLaunchConfigurationTemplateRequestPostLaunchActions(
                cloud_watch_log_group_name = None,
                deployment = None,
                s3_log_bucket = None,
                s3_output_key_prefix = None,
                ssm_documents = None
            )
        else:
            return CreateLaunchConfigurationTemplateRequestPostLaunchActions(
        )
        """

    def testCreateLaunchConfigurationTemplateRequestPostLaunchActions(self):
        """Test CreateLaunchConfigurationTemplateRequestPostLaunchActions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    Twilio - Taskrouter

    This is the public Twilio REST API.

    The version of the OpenAPI document: 1.42.0
    Contact: support@twilio.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.taskrouter_v1_workspace_workflow import TaskrouterV1WorkspaceWorkflow

class TestTaskrouterV1WorkspaceWorkflow(unittest.TestCase):
    """TaskrouterV1WorkspaceWorkflow unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TaskrouterV1WorkspaceWorkflow:
        """Test TaskrouterV1WorkspaceWorkflow
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TaskrouterV1WorkspaceWorkflow`
        """
        model = TaskrouterV1WorkspaceWorkflow()
        if include_optional:
            return TaskrouterV1WorkspaceWorkflow(
                account_sid = 'AC62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233',
                assignment_callback_url = '',
                configuration = '',
                date_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                date_updated = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                document_content_type = '',
                fallback_assignment_callback_url = '',
                friendly_name = '',
                links = None,
                sid = 'WW62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233',
                task_reservation_timeout = 56,
                url = '',
                workspace_sid = 'WS62ECB020842930cc01FFCCfeEe150AC30123456789101112131415161718192021222324252627282930313233'
            )
        else:
            return TaskrouterV1WorkspaceWorkflow(
        )
        """

    def testTaskrouterV1WorkspaceWorkflow(self):
        """Test TaskrouterV1WorkspaceWorkflow"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

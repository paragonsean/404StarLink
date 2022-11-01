# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.job import Job

class TestJob(unittest.TestCase):
    """Job unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Job:
        """Test Job
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Job`
        """
        model = Job()
        if include_optional:
            return Job(
                check_run_url = 'https://api.github.com/repos/github/hello-world/check-runs/4',
                completed_at = '2019-08-08T08:00-07:00',
                conclusion = 'success',
                head_sha = '009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d',
                html_url = 'https://github.com/github/hello-world/runs/4',
                id = 21,
                labels = ["self-hosted","foo","bar"],
                name = 'test-coverage',
                node_id = 'MDg6Q2hlY2tSdW40',
                run_attempt = 1,
                run_id = 5,
                run_url = 'https://api.github.com/repos/github/hello-world/actions/runs/5',
                runner_group_id = 2,
                runner_group_name = 'my runner group',
                runner_id = 1,
                runner_name = 'my runner',
                started_at = '2019-08-08T08:00-07:00',
                status = 'queued',
                steps = [
                    openapi_client.models.job_steps_inner.job_steps_inner(
                        completed_at = '2019-08-08T08:00-07:00', 
                        conclusion = 'success', 
                        name = 'test-coverage', 
                        number = 1, 
                        started_at = '2019-08-08T08:00-07:00', 
                        status = 'queued', )
                    ],
                url = 'https://api.github.com/repos/github/hello-world/actions/jobs/21'
            )
        else:
            return Job(
                check_run_url = 'https://api.github.com/repos/github/hello-world/check-runs/4',
                completed_at = '2019-08-08T08:00-07:00',
                conclusion = 'success',
                head_sha = '009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d',
                html_url = 'https://github.com/github/hello-world/runs/4',
                id = 21,
                labels = ["self-hosted","foo","bar"],
                name = 'test-coverage',
                node_id = 'MDg6Q2hlY2tSdW40',
                run_id = 5,
                run_url = 'https://api.github.com/repos/github/hello-world/actions/runs/5',
                runner_group_id = 2,
                runner_group_name = 'my runner group',
                runner_id = 1,
                runner_name = 'my runner',
                started_at = '2019-08-08T08:00-07:00',
                status = 'queued',
                url = 'https://api.github.com/repos/github/hello-world/actions/jobs/21',
        )
        """

    def testJob(self):
        """Test Job"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()

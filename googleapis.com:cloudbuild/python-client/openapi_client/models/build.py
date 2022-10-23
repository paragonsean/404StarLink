# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.artifacts import Artifacts
from openapi_client.models.build_approval import BuildApproval
from openapi_client.models.build_options import BuildOptions
from openapi_client.models.build_step import BuildStep
from openapi_client.models.failure_info import FailureInfo
from openapi_client.models.results import Results
from openapi_client.models.secret import Secret
from openapi_client.models.secrets import Secrets
from openapi_client.models.source import Source
from openapi_client.models.source_provenance import SourceProvenance
from openapi_client.models.time_span import TimeSpan
from openapi_client.models.warning import Warning
from typing import Optional, Set
from typing_extensions import Self

class Build(BaseModel):
    """
    A build resource in the Cloud Build API. At a high level, a `Build` describes where to find source code, how to build it (for example, the builder image to run on the source), and where to store the built artifacts. Fields can include the following variables, which will be expanded when the build is created: - $PROJECT_ID: the project ID of the build. - $PROJECT_NUMBER: the project number of the build. - $LOCATION: the location/region of the build. - $BUILD_ID: the autogenerated ID of the build. - $REPO_NAME: the source repository name specified by RepoSource. - $BRANCH_NAME: the branch name specified by RepoSource. - $TAG_NAME: the tag name specified by RepoSource. - $REVISION_ID or $COMMIT_SHA: the commit SHA specified by RepoSource or resolved from the specified branch or tag. - $SHORT_SHA: first 7 characters of $REVISION_ID or $COMMIT_SHA.
    """ # noqa: E501
    approval: Optional[BuildApproval] = None
    artifacts: Optional[Artifacts] = None
    available_secrets: Optional[Secrets] = Field(default=None, alias="availableSecrets")
    build_trigger_id: Optional[StrictStr] = Field(default=None, description="Output only. The ID of the `BuildTrigger` that triggered this build, if it was triggered automatically.", alias="buildTriggerId")
    create_time: Optional[StrictStr] = Field(default=None, description="Output only. Time at which the request to create the build was received.", alias="createTime")
    failure_info: Optional[FailureInfo] = Field(default=None, alias="failureInfo")
    finish_time: Optional[StrictStr] = Field(default=None, description="Output only. Time at which execution of the build was finished. The difference between finish_time and start_time is the duration of the build's execution.", alias="finishTime")
    id: Optional[StrictStr] = Field(default=None, description="Output only. Unique identifier of the build.")
    images: Optional[List[StrictStr]] = Field(default=None, description="A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account's credentials. The digests of the pushed images will be stored in the `Build` resource's results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.")
    log_url: Optional[StrictStr] = Field(default=None, description="Output only. URL to logs for this build in Google Cloud Console.", alias="logUrl")
    logs_bucket: Optional[StrictStr] = Field(default=None, description="Google Cloud Storage bucket where logs should be written (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.", alias="logsBucket")
    name: Optional[StrictStr] = Field(default=None, description="Output only. The 'Build' name with format: `projects/{project}/locations/{location}/builds/{build}`, where {build} is a unique identifier generated by the service.")
    options: Optional[BuildOptions] = None
    project_id: Optional[StrictStr] = Field(default=None, description="Output only. ID of the project.", alias="projectId")
    queue_ttl: Optional[StrictStr] = Field(default=None, description="TTL in queue for this build. If provided and the build is enqueued longer than this value, the build will expire and the build status will be `EXPIRED`. The TTL starts ticking from create_time.", alias="queueTtl")
    results: Optional[Results] = None
    secrets: Optional[List[Secret]] = Field(default=None, description="Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets")
    service_account: Optional[StrictStr] = Field(default=None, description="IAM service account whose credentials will be used at build runtime. Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of the service account. ", alias="serviceAccount")
    source: Optional[Source] = None
    source_provenance: Optional[SourceProvenance] = Field(default=None, alias="sourceProvenance")
    start_time: Optional[StrictStr] = Field(default=None, description="Output only. Time at which execution of the build was started.", alias="startTime")
    status: Optional[StrictStr] = Field(default=None, description="Output only. Status of the build.")
    status_detail: Optional[StrictStr] = Field(default=None, description="Output only. Customer-readable message about the current status.", alias="statusDetail")
    steps: Optional[List[BuildStep]] = Field(default=None, description="Required. The operations to be performed on the workspace.")
    substitutions: Optional[Dict[str, StrictStr]] = Field(default=None, description="Substitutions data for `Build` resource.")
    tags: Optional[List[StrictStr]] = Field(default=None, description="Tags for annotation of a `Build`. These are not docker tags.")
    timeout: Optional[StrictStr] = Field(default=None, description="Amount of time that this build should be allowed to run, to second granularity. If this amount of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout` starts ticking from `startTime`. Default time is 60 minutes.")
    timing: Optional[Dict[str, TimeSpan]] = Field(default=None, description="Output only. Stores timing information for phases of the build. Valid keys are: * BUILD: time to execute all build steps. * PUSH: time to push all artifacts including docker images and non docker artifacts. * FETCHSOURCE: time to fetch source. * SETUPBUILD: time to set up build. If the build does not specify source or images, these keys will not be included.")
    warnings: Optional[List[Warning]] = Field(default=None, description="Output only. Non-fatal problems encountered during the execution of the build.")
    __properties: ClassVar[List[str]] = ["approval", "artifacts", "availableSecrets", "buildTriggerId", "createTime", "failureInfo", "finishTime", "id", "images", "logUrl", "logsBucket", "name", "options", "projectId", "queueTtl", "results", "secrets", "serviceAccount", "source", "sourceProvenance", "startTime", "status", "statusDetail", "steps", "substitutions", "tags", "timeout", "timing", "warnings"]

    @field_validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['STATUS_UNKNOWN', 'PENDING', 'QUEUED', 'WORKING', 'SUCCESS', 'FAILURE', 'INTERNAL_ERROR', 'TIMEOUT', 'CANCELLED', 'EXPIRED']):
            raise ValueError("must be one of enum values ('STATUS_UNKNOWN', 'PENDING', 'QUEUED', 'WORKING', 'SUCCESS', 'FAILURE', 'INTERNAL_ERROR', 'TIMEOUT', 'CANCELLED', 'EXPIRED')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Build from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "build_trigger_id",
            "create_time",
            "finish_time",
            "id",
            "log_url",
            "name",
            "project_id",
            "start_time",
            "status",
            "status_detail",
            "timing",
            "warnings",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of approval
        if self.approval:
            _dict['approval'] = self.approval.to_dict()
        # override the default output from pydantic by calling `to_dict()` of artifacts
        if self.artifacts:
            _dict['artifacts'] = self.artifacts.to_dict()
        # override the default output from pydantic by calling `to_dict()` of available_secrets
        if self.available_secrets:
            _dict['availableSecrets'] = self.available_secrets.to_dict()
        # override the default output from pydantic by calling `to_dict()` of failure_info
        if self.failure_info:
            _dict['failureInfo'] = self.failure_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of options
        if self.options:
            _dict['options'] = self.options.to_dict()
        # override the default output from pydantic by calling `to_dict()` of results
        if self.results:
            _dict['results'] = self.results.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in secrets (list)
        _items = []
        if self.secrets:
            for _item_secrets in self.secrets:
                if _item_secrets:
                    _items.append(_item_secrets.to_dict())
            _dict['secrets'] = _items
        # override the default output from pydantic by calling `to_dict()` of source
        if self.source:
            _dict['source'] = self.source.to_dict()
        # override the default output from pydantic by calling `to_dict()` of source_provenance
        if self.source_provenance:
            _dict['sourceProvenance'] = self.source_provenance.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in steps (list)
        _items = []
        if self.steps:
            for _item_steps in self.steps:
                if _item_steps:
                    _items.append(_item_steps.to_dict())
            _dict['steps'] = _items
        # override the default output from pydantic by calling `to_dict()` of each value in timing (dict)
        _field_dict = {}
        if self.timing:
            for _key_timing in self.timing:
                if self.timing[_key_timing]:
                    _field_dict[_key_timing] = self.timing[_key_timing].to_dict()
            _dict['timing'] = _field_dict
        # override the default output from pydantic by calling `to_dict()` of each item in warnings (list)
        _items = []
        if self.warnings:
            for _item_warnings in self.warnings:
                if _item_warnings:
                    _items.append(_item_warnings.to_dict())
            _dict['warnings'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Build from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "approval": BuildApproval.from_dict(obj["approval"]) if obj.get("approval") is not None else None,
            "artifacts": Artifacts.from_dict(obj["artifacts"]) if obj.get("artifacts") is not None else None,
            "availableSecrets": Secrets.from_dict(obj["availableSecrets"]) if obj.get("availableSecrets") is not None else None,
            "buildTriggerId": obj.get("buildTriggerId"),
            "createTime": obj.get("createTime"),
            "failureInfo": FailureInfo.from_dict(obj["failureInfo"]) if obj.get("failureInfo") is not None else None,
            "finishTime": obj.get("finishTime"),
            "id": obj.get("id"),
            "images": obj.get("images"),
            "logUrl": obj.get("logUrl"),
            "logsBucket": obj.get("logsBucket"),
            "name": obj.get("name"),
            "options": BuildOptions.from_dict(obj["options"]) if obj.get("options") is not None else None,
            "projectId": obj.get("projectId"),
            "queueTtl": obj.get("queueTtl"),
            "results": Results.from_dict(obj["results"]) if obj.get("results") is not None else None,
            "secrets": [Secret.from_dict(_item) for _item in obj["secrets"]] if obj.get("secrets") is not None else None,
            "serviceAccount": obj.get("serviceAccount"),
            "source": Source.from_dict(obj["source"]) if obj.get("source") is not None else None,
            "sourceProvenance": SourceProvenance.from_dict(obj["sourceProvenance"]) if obj.get("sourceProvenance") is not None else None,
            "startTime": obj.get("startTime"),
            "status": obj.get("status"),
            "statusDetail": obj.get("statusDetail"),
            "steps": [BuildStep.from_dict(_item) for _item in obj["steps"]] if obj.get("steps") is not None else None,
            "substitutions": obj.get("substitutions"),
            "tags": obj.get("tags"),
            "timeout": obj.get("timeout"),
            "timing": dict(
                (_k, TimeSpan.from_dict(_v))
                for _k, _v in obj["timing"].items()
            )
            if obj.get("timing") is not None
            else None,
            "warnings": [Warning.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None
        })
        return _obj



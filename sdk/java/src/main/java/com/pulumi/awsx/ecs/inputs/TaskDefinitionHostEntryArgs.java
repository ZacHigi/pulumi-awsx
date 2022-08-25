// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionHostEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionHostEntryArgs Empty = new TaskDefinitionHostEntryArgs();

    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    private TaskDefinitionHostEntryArgs() {}

    private TaskDefinitionHostEntryArgs(TaskDefinitionHostEntryArgs $) {
        this.hostname = $.hostname;
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionHostEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionHostEntryArgs $;

        public Builder() {
            $ = new TaskDefinitionHostEntryArgs();
        }

        public Builder(TaskDefinitionHostEntryArgs defaults) {
            $ = new TaskDefinitionHostEntryArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public TaskDefinitionHostEntryArgs build() {
            return $;
        }
    }

}